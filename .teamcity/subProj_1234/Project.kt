package subProj_1234

import subProj_1234.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1234")
    name = "subProj 1234"

    buildType(subProj_bt_1234_0)
    buildType(subProj_bt_1234_1)
    buildType(subProj_bt_1234_2)
    buildType(subProj_bt_1234_3)
    buildType(subProj_bt_1234_4)
    buildType(subProj_bt_1234_5)
})
