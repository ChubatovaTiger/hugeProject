package subProj_258

import subProj_258.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_258")
    name = "subProj 258"

    buildType(subProj_bt_258_5)
    buildType(subProj_bt_258_3)
    buildType(subProj_bt_258_4)
    buildType(subProj_bt_258_1)
    buildType(subProj_bt_258_2)
    buildType(subProj_bt_258_0)
})
