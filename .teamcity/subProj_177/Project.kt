package subProj_177

import subProj_177.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_177")
    name = "subProj 177"

    buildType(subProj_bt_177_0)
    buildType(subProj_bt_177_2)
    buildType(subProj_bt_177_1)
    buildType(subProj_bt_177_4)
    buildType(subProj_bt_177_3)
    buildType(subProj_bt_177_5)
})
