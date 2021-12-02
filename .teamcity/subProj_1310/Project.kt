package subProj_1310

import subProj_1310.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1310")
    name = "subProj 1310"

    buildType(subProj_bt_1310_0)
    buildType(subProj_bt_1310_5)
    buildType(subProj_bt_1310_2)
    buildType(subProj_bt_1310_1)
    buildType(subProj_bt_1310_4)
    buildType(subProj_bt_1310_3)
})
