package subProj_1129

import subProj_1129.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1129")
    name = "subProj 1129"

    buildType(subProj_bt_1129_1)
    buildType(subProj_bt_1129_2)
    buildType(subProj_bt_1129_0)
    buildType(subProj_bt_1129_5)
    buildType(subProj_bt_1129_3)
    buildType(subProj_bt_1129_4)
})
