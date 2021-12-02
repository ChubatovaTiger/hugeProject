package subProj_1985

import subProj_1985.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1985")
    name = "subProj 1985"

    buildType(subProj_bt_1985_2)
    buildType(subProj_bt_1985_1)
    buildType(subProj_bt_1985_4)
    buildType(subProj_bt_1985_3)
    buildType(subProj_bt_1985_0)
    buildType(subProj_bt_1985_5)
})
