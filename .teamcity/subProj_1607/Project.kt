package subProj_1607

import subProj_1607.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1607")
    name = "subProj 1607"

    buildType(subProj_bt_1607_5)
    buildType(subProj_bt_1607_4)
    buildType(subProj_bt_1607_3)
    buildType(subProj_bt_1607_2)
    buildType(subProj_bt_1607_1)
    buildType(subProj_bt_1607_0)
})
