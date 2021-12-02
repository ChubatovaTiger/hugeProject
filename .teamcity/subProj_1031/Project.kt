package subProj_1031

import subProj_1031.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1031")
    name = "subProj 1031"

    buildType(subProj_bt_1031_5)
    buildType(subProj_bt_1031_1)
    buildType(subProj_bt_1031_2)
    buildType(subProj_bt_1031_3)
    buildType(subProj_bt_1031_4)
    buildType(subProj_bt_1031_0)
})
