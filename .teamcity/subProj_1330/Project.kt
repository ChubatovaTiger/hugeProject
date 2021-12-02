package subProj_1330

import subProj_1330.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1330")
    name = "subProj 1330"

    buildType(subProj_bt_1330_1)
    buildType(subProj_bt_1330_2)
    buildType(subProj_bt_1330_0)
    buildType(subProj_bt_1330_5)
    buildType(subProj_bt_1330_3)
    buildType(subProj_bt_1330_4)
})
