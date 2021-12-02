package subProj_1109

import subProj_1109.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1109")
    name = "subProj 1109"

    buildType(subProj_bt_1109_0)
    buildType(subProj_bt_1109_2)
    buildType(subProj_bt_1109_1)
    buildType(subProj_bt_1109_4)
    buildType(subProj_bt_1109_3)
    buildType(subProj_bt_1109_5)
})
