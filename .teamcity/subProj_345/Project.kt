package subProj_345

import subProj_345.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_345")
    name = "subProj 345"

    buildType(subProj_bt_345_4)
    buildType(subProj_bt_345_5)
    buildType(subProj_bt_345_0)
    buildType(subProj_bt_345_1)
    buildType(subProj_bt_345_2)
    buildType(subProj_bt_345_3)
})
