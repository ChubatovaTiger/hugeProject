package subProj_1632

import subProj_1632.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1632")
    name = "subProj 1632"

    buildType(subProj_bt_1632_0)
    buildType(subProj_bt_1632_1)
    buildType(subProj_bt_1632_2)
    buildType(subProj_bt_1632_3)
    buildType(subProj_bt_1632_4)
    buildType(subProj_bt_1632_5)
})
