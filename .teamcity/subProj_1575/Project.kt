package subProj_1575

import subProj_1575.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1575")
    name = "subProj 1575"

    buildType(subProj_bt_1575_4)
    buildType(subProj_bt_1575_5)
    buildType(subProj_bt_1575_0)
    buildType(subProj_bt_1575_1)
    buildType(subProj_bt_1575_2)
    buildType(subProj_bt_1575_3)
})
