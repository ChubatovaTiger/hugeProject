package subProj_1619

import subProj_1619.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1619")
    name = "subProj 1619"

    buildType(subProj_bt_1619_0)
    buildType(subProj_bt_1619_1)
    buildType(subProj_bt_1619_2)
    buildType(subProj_bt_1619_3)
    buildType(subProj_bt_1619_4)
    buildType(subProj_bt_1619_5)
})
