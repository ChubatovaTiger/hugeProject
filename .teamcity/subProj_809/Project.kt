package subProj_809

import subProj_809.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_809")
    name = "subProj 809"

    buildType(subProj_bt_809_0)
    buildType(subProj_bt_809_1)
    buildType(subProj_bt_809_2)
    buildType(subProj_bt_809_3)
    buildType(subProj_bt_809_4)
    buildType(subProj_bt_809_5)
})
