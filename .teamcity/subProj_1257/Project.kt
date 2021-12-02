package subProj_1257

import subProj_1257.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1257")
    name = "subProj 1257"

    buildType(subProj_bt_1257_0)
    buildType(subProj_bt_1257_2)
    buildType(subProj_bt_1257_1)
    buildType(subProj_bt_1257_4)
    buildType(subProj_bt_1257_3)
    buildType(subProj_bt_1257_5)
})
