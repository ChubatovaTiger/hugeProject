package subProj_62

import subProj_62.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_62")
    name = "subProj 62"

    buildType(subProj_bt_62_0)
    buildType(subProj_bt_62_1)
    buildType(subProj_bt_62_4)
    buildType(subProj_bt_62_5)
    buildType(subProj_bt_62_2)
    buildType(subProj_bt_62_3)
})
