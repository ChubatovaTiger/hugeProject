package subProj_1078

import subProj_1078.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1078")
    name = "subProj 1078"

    buildType(subProj_bt_1078_4)
    buildType(subProj_bt_1078_5)
    buildType(subProj_bt_1078_2)
    buildType(subProj_bt_1078_3)
    buildType(subProj_bt_1078_0)
    buildType(subProj_bt_1078_1)
})
