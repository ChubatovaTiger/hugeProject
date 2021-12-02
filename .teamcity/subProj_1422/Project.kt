package subProj_1422

import subProj_1422.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1422")
    name = "subProj 1422"

    buildType(subProj_bt_1422_3)
    buildType(subProj_bt_1422_4)
    buildType(subProj_bt_1422_5)
    buildType(subProj_bt_1422_0)
    buildType(subProj_bt_1422_1)
    buildType(subProj_bt_1422_2)
})
