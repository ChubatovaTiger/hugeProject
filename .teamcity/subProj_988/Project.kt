package subProj_988

import subProj_988.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_988")
    name = "subProj 988"

    buildType(subProj_bt_988_5)
    buildType(subProj_bt_988_3)
    buildType(subProj_bt_988_4)
    buildType(subProj_bt_988_1)
    buildType(subProj_bt_988_2)
    buildType(subProj_bt_988_0)
})
