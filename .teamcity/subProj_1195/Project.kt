package subProj_1195

import subProj_1195.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1195")
    name = "subProj 1195"

    buildType(subProj_bt_1195_3)
    buildType(subProj_bt_1195_2)
    buildType(subProj_bt_1195_5)
    buildType(subProj_bt_1195_4)
    buildType(subProj_bt_1195_1)
    buildType(subProj_bt_1195_0)
})
