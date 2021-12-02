package subProj_985

import subProj_985.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_985")
    name = "subProj 985"

    buildType(subProj_bt_985_0)
    buildType(subProj_bt_985_1)
    buildType(subProj_bt_985_4)
    buildType(subProj_bt_985_5)
    buildType(subProj_bt_985_2)
    buildType(subProj_bt_985_3)
})
