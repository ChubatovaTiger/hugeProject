package subProj_269

import subProj_269.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_269")
    name = "subProj 269"

    buildType(subProj_bt_269_5)
    buildType(subProj_bt_269_4)
    buildType(subProj_bt_269_3)
    buildType(subProj_bt_269_2)
    buildType(subProj_bt_269_1)
    buildType(subProj_bt_269_0)
})
