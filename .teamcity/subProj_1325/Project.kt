package subProj_1325

import subProj_1325.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1325")
    name = "subProj 1325"

    buildType(subProj_bt_1325_5)
    buildType(subProj_bt_1325_3)
    buildType(subProj_bt_1325_4)
    buildType(subProj_bt_1325_1)
    buildType(subProj_bt_1325_2)
    buildType(subProj_bt_1325_0)
})
