package subProj_1548

import subProj_1548.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1548")
    name = "subProj 1548"

    buildType(subProj_bt_1548_5)
    buildType(subProj_bt_1548_4)
    buildType(subProj_bt_1548_3)
    buildType(subProj_bt_1548_2)
    buildType(subProj_bt_1548_1)
    buildType(subProj_bt_1548_0)
})
