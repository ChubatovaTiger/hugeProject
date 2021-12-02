package subProj_977

import subProj_977.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_977")
    name = "subProj 977"

    buildType(subProj_bt_977_5)
    buildType(subProj_bt_977_3)
    buildType(subProj_bt_977_4)
    buildType(subProj_bt_977_1)
    buildType(subProj_bt_977_2)
    buildType(subProj_bt_977_0)
})
