package subProj_1289

import subProj_1289.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1289")
    name = "subProj 1289"

    buildType(subProj_bt_1289_2)
    buildType(subProj_bt_1289_3)
    buildType(subProj_bt_1289_0)
    buildType(subProj_bt_1289_1)
    buildType(subProj_bt_1289_4)
    buildType(subProj_bt_1289_5)
})
