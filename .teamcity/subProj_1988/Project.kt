package subProj_1988

import subProj_1988.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1988")
    name = "subProj 1988"

    buildType(subProj_bt_1988_1)
    buildType(subProj_bt_1988_0)
    buildType(subProj_bt_1988_3)
    buildType(subProj_bt_1988_2)
    buildType(subProj_bt_1988_5)
    buildType(subProj_bt_1988_4)
})
