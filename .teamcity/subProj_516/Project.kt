package subProj_516

import subProj_516.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_516")
    name = "subProj 516"

    buildType(subProj_bt_516_4)
    buildType(subProj_bt_516_5)
    buildType(subProj_bt_516_2)
    buildType(subProj_bt_516_3)
    buildType(subProj_bt_516_0)
    buildType(subProj_bt_516_1)
})
