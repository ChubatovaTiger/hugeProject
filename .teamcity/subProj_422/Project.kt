package subProj_422

import subProj_422.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_422")
    name = "subProj 422"

    buildType(subProj_bt_422_1)
    buildType(subProj_bt_422_0)
    buildType(subProj_bt_422_3)
    buildType(subProj_bt_422_2)
    buildType(subProj_bt_422_5)
    buildType(subProj_bt_422_4)
})
