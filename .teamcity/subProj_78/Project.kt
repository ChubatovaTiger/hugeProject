package subProj_78

import subProj_78.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_78")
    name = "subProj 78"

    buildType(subProj_bt_78_0)
    buildType(subProj_bt_78_3)
    buildType(subProj_bt_78_4)
    buildType(subProj_bt_78_1)
    buildType(subProj_bt_78_2)
    buildType(subProj_bt_78_5)
})
