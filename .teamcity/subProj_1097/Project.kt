package subProj_1097

import subProj_1097.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1097")
    name = "subProj 1097"

    buildType(subProj_bt_1097_5)
    buildType(subProj_bt_1097_4)
    buildType(subProj_bt_1097_3)
    buildType(subProj_bt_1097_2)
    buildType(subProj_bt_1097_1)
    buildType(subProj_bt_1097_0)
})
