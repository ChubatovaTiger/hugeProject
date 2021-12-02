package subProj_762

import subProj_762.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_762")
    name = "subProj 762"

    buildType(subProj_bt_762_0)
    buildType(subProj_bt_762_5)
    buildType(subProj_bt_762_2)
    buildType(subProj_bt_762_1)
    buildType(subProj_bt_762_4)
    buildType(subProj_bt_762_3)
})
