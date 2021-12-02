package subProj_1931

import subProj_1931.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1931")
    name = "subProj 1931"

    buildType(subProj_bt_1931_3)
    buildType(subProj_bt_1931_2)
    buildType(subProj_bt_1931_1)
    buildType(subProj_bt_1931_0)
    buildType(subProj_bt_1931_5)
    buildType(subProj_bt_1931_4)
})
