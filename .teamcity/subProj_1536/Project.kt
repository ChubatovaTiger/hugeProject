package subProj_1536

import subProj_1536.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1536")
    name = "subProj 1536"

    buildType(subProj_bt_1536_5)
    buildType(subProj_bt_1536_3)
    buildType(subProj_bt_1536_4)
    buildType(subProj_bt_1536_1)
    buildType(subProj_bt_1536_2)
    buildType(subProj_bt_1536_0)
})
