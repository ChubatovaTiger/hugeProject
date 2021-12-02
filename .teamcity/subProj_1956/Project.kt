package subProj_1956

import subProj_1956.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1956")
    name = "subProj 1956"

    buildType(subProj_bt_1956_0)
    buildType(subProj_bt_1956_5)
    buildType(subProj_bt_1956_1)
    buildType(subProj_bt_1956_2)
    buildType(subProj_bt_1956_3)
    buildType(subProj_bt_1956_4)
})
