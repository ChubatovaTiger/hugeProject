package subProj_972

import subProj_972.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_972")
    name = "subProj 972"

    buildType(subProj_bt_972_1)
    buildType(subProj_bt_972_0)
    buildType(subProj_bt_972_3)
    buildType(subProj_bt_972_2)
    buildType(subProj_bt_972_5)
    buildType(subProj_bt_972_4)
})
