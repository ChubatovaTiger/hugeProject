package subProj_59

import subProj_59.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_59")
    name = "subProj 59"

    buildType(subProj_bt_59_1)
    buildType(subProj_bt_59_0)
    buildType(subProj_bt_59_3)
    buildType(subProj_bt_59_2)
    buildType(subProj_bt_59_5)
    buildType(subProj_bt_59_4)
})
