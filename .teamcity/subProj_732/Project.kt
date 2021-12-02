package subProj_732

import subProj_732.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_732")
    name = "subProj 732"

    buildType(subProj_bt_732_1)
    buildType(subProj_bt_732_0)
    buildType(subProj_bt_732_5)
    buildType(subProj_bt_732_4)
    buildType(subProj_bt_732_3)
    buildType(subProj_bt_732_2)
})
