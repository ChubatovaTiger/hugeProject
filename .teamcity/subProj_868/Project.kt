package subProj_868

import subProj_868.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_868")
    name = "subProj 868"

    buildType(subProj_bt_868_5)
    buildType(subProj_bt_868_4)
    buildType(subProj_bt_868_3)
    buildType(subProj_bt_868_2)
    buildType(subProj_bt_868_1)
    buildType(subProj_bt_868_0)
})
