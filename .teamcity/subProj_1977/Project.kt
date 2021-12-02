package subProj_1977

import subProj_1977.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1977")
    name = "subProj 1977"

    buildType(subProj_bt_1977_0)
    buildType(subProj_bt_1977_1)
    buildType(subProj_bt_1977_2)
    buildType(subProj_bt_1977_3)
    buildType(subProj_bt_1977_4)
    buildType(subProj_bt_1977_5)
})
