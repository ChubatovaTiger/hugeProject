package subProj_1398

import subProj_1398.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1398")
    name = "subProj 1398"

    buildType(subProj_bt_1398_2)
    buildType(subProj_bt_1398_1)
    buildType(subProj_bt_1398_4)
    buildType(subProj_bt_1398_3)
    buildType(subProj_bt_1398_5)
    buildType(subProj_bt_1398_0)
})
