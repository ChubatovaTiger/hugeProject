package subProj_837

import subProj_837.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_837")
    name = "subProj 837"

    buildType(subProj_bt_837_2)
    buildType(subProj_bt_837_3)
    buildType(subProj_bt_837_0)
    buildType(subProj_bt_837_1)
    buildType(subProj_bt_837_4)
    buildType(subProj_bt_837_5)
})
