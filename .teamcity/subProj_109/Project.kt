package subProj_109

import subProj_109.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_109")
    name = "subProj 109"

    buildType(subProj_bt_109_0)
    buildType(subProj_bt_109_1)
    buildType(subProj_bt_109_4)
    buildType(subProj_bt_109_5)
    buildType(subProj_bt_109_2)
    buildType(subProj_bt_109_3)
})
