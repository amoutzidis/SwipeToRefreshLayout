package gr.amoutzidis.swipetorefreshlayout.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import gr.amoutzidis.swipetorefreshlayout.R

class SwipeToRefreshLayout: SwipeRefreshLayout{

    constructor(context: Context) : this(context, null){
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs,
        R.attr.swipeToRefreshLayoutStyle
    ){
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs){

        val a = context.obtainStyledAttributes(attrs,
            R.styleable.SwipeToRefreshLayout, defStyleAttr,
            R.style.SwipeToRefreshLayout
        )
        val backgroundColor = a.getColor(R.styleable.SwipeToRefreshLayout_backgroundColor, Color.WHITE)
        val progressColor1 = a.getColor(R.styleable.SwipeToRefreshLayout_progressColor1, Color.WHITE)
        val progressColor2 = a.getColor(R.styleable.SwipeToRefreshLayout_progressColor2, Color.WHITE)
        val progressColor3 = a.getColor(R.styleable.SwipeToRefreshLayout_progressColor3, Color.WHITE)

        setBackgroundSchemeColor(backgroundColor)
        setProgressColor(progressColor1, progressColor2, progressColor3)

    }

    fun setBackgroundSchemeColor(color: Int){
        setProgressBackgroundColorSchemeColor(color)
    }

    fun setProgressColor(firstColor: Int, secondColor: Int, thirdColor: Int){
        setColorSchemeColors(firstColor, secondColor, thirdColor)
    }

    private fun init(attrs: AttributeSet?) {
//        @ColorInt val progressColor: Int = ThemeHelper.exportColor(context, R.attr.swipeProgressColor)
//        @ColorInt val backgroundColor: Int = ThemeHelper.exportColor(context, R.attr.swipeBackgroundColor)

//        setColorSchemeColors(progressColor, progressColor, progressColor)
//        setProgressBackgroundColorSchemeColor(backgroundColor)
    }

}