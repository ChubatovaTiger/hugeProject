package subProj_775

import subProj_775.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_775")
    name = "subProj 775"

    buildType(subProj_bt_775_4)
    buildType(subProj_bt_775_3)
    buildType(subProj_bt_775_5)
    buildType(subProj_bt_775_0)
    buildType(subProj_bt_775_2)
    buildType(subProj_bt_775_1)
})
