package subProj_1640

import subProj_1640.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1640")
    name = "subProj 1640"

    buildType(subProj_bt_1640_0)
    buildType(subProj_bt_1640_2)
    buildType(subProj_bt_1640_1)
    buildType(subProj_bt_1640_4)
    buildType(subProj_bt_1640_3)
    buildType(subProj_bt_1640_5)
})
