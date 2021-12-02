package subProj_1404

import subProj_1404.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1404")
    name = "subProj 1404"

    buildType(subProj_bt_1404_5)
    buildType(subProj_bt_1404_4)
    buildType(subProj_bt_1404_3)
    buildType(subProj_bt_1404_2)
    buildType(subProj_bt_1404_1)
    buildType(subProj_bt_1404_0)
})
