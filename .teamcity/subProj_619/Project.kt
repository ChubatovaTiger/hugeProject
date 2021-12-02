package subProj_619

import subProj_619.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_619")
    name = "subProj 619"

    buildType(subProj_bt_619_3)
    buildType(subProj_bt_619_2)
    buildType(subProj_bt_619_5)
    buildType(subProj_bt_619_4)
    buildType(subProj_bt_619_1)
    buildType(subProj_bt_619_0)
})
