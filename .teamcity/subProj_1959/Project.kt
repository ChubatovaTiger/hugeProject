package subProj_1959

import subProj_1959.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1959")
    name = "subProj 1959"

    buildType(subProj_bt_1959_2)
    buildType(subProj_bt_1959_3)
    buildType(subProj_bt_1959_4)
    buildType(subProj_bt_1959_5)
    buildType(subProj_bt_1959_0)
    buildType(subProj_bt_1959_1)
})
