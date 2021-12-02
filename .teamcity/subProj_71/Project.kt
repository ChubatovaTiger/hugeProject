package subProj_71

import subProj_71.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_71")
    name = "subProj 71"

    buildType(subProj_bt_71_2)
    buildType(subProj_bt_71_3)
    buildType(subProj_bt_71_0)
    buildType(subProj_bt_71_1)
    buildType(subProj_bt_71_4)
    buildType(subProj_bt_71_5)
})
