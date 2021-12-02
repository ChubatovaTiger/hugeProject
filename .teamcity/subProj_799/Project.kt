package subProj_799

import subProj_799.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_799")
    name = "subProj 799"

    buildType(subProj_bt_799_5)
    buildType(subProj_bt_799_3)
    buildType(subProj_bt_799_4)
    buildType(subProj_bt_799_1)
    buildType(subProj_bt_799_2)
    buildType(subProj_bt_799_0)
})
