package subProj_390

import subProj_390.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_390")
    name = "subProj 390"

    buildType(subProj_bt_390_0)
    buildType(subProj_bt_390_1)
    buildType(subProj_bt_390_4)
    buildType(subProj_bt_390_5)
    buildType(subProj_bt_390_2)
    buildType(subProj_bt_390_3)
})
