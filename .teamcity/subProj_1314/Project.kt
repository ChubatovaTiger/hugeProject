package subProj_1314

import subProj_1314.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1314")
    name = "subProj 1314"

    buildType(subProj_bt_1314_5)
    buildType(subProj_bt_1314_2)
    buildType(subProj_bt_1314_1)
    buildType(subProj_bt_1314_4)
    buildType(subProj_bt_1314_3)
    buildType(subProj_bt_1314_0)
})