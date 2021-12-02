package subProj_1258

import subProj_1258.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1258")
    name = "subProj 1258"

    buildType(subProj_bt_1258_1)
    buildType(subProj_bt_1258_0)
    buildType(subProj_bt_1258_3)
    buildType(subProj_bt_1258_2)
    buildType(subProj_bt_1258_5)
    buildType(subProj_bt_1258_4)
})
